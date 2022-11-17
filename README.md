# leezy-spring
## 개발 환경
- Intellij IDEA 02022.2.2
- Java 11
- Gradle 7.5
- Spring Boot 2.6.12
- Ubuntu 18.04 (LTS)

## Intellij에서 Java 11 설치
- File - Settings - Build, Execution, Deployment - Build Tools - Gradle
- Gradle projects - Gradle - Gradle JVM - Download JDK 선택
- Version: 11, Vendor: Amazon Corretto 선택 후 Download 버튼 클릭
- OK 버튼 클릭으로 적용

## Intellij Plugin
- CamelCase 카멜/케밥/스네이크/파스칼 케이스 등을 손쉽게 전환 (Shift+Alt+U)
- GitToolBox
- JPA Buddy :
- Key Promoter X : 마우스를 사용하지 안도록 shortcut을 알려줌
- Presentation Assistant
- Ideolog : .log 파일 상호작용 뷰어
- Spring Boot Assistant : 스프링 부트 설정 파일 자동 완성 지원

- ANSI Highlighter Premium
- Atom Material Icons : 파일 및 IDE 아이콘
- Grep Console : 콘솔(터미널)에 필요한 모든 것


## docker 기반 개발환경 구축
### wsl2 설치
- Windows 버전 확인: Windows 10 버전 2004 이상(빌드 19041 이상) 또는 Windows 11
- PowerShell 관리자 권한으로 실행 후  
```
$ wsl --install   
```
- wsl 버전 확인: wsl -l -v(기본적으로 wsl2 버전으로 설치됨)
- [참고 사이트](https://learn.microsoft.com/ko-kr/windows/wsl/install)
### 우분투 리눅스 18.04 설치
```
$ wsl --install -d Ubuntu-18.04 
```
### docker및 docker-compose 설치
- [참고 사이트](https://learn.microsoft.com/ko-kr/windows/wsl/tutorials/wsl-containers)
- [Docker Desktop 다운로드 링크](https://docs.docker.com/desktop/windows/wsl/#download)
- 
### 오라클 설치
- [참고 사이트](https://solo5star.tistory.com/17)
```
$ git clone https://github.com/oracle/docker-images

$ cd docker-images/OracleDatabase/SingleInstance/dockerfiles
$ ./buildContainerImage.sh -v 18.4.0 -x
```
- docker-compose.yml
```
version: "3"
services:
  oracle-xe-18c:
    image: oracle/database:18.4.0-xe
    container_name: oracle-xe-18c
    restart: unless-stopped
    ports:
      - 1521:1521
      - 5500:5500
    volumes:
      # The data volume to use for the database.
      # Has to be writable by the Unix "oracle" (uid: 54321) user inside the container!
      # If omitted the database will not be persisted over container recreation.
      - ./oradata:/opt/oracle/oradata
      # Optional: A volume with custom scripts to be run after database startup.
      # For further details see the "Running scripts after setup and on startup" section below.
      #- ./scripts/startup:/opt/oracle/scripts/startup
      # Optional: A volume with custom scripts to be run after database setup.
      # For further details see the "Running scripts after setup and on startup" section below.
      #- ./scripts/setup:/opt/oracle/scripts/setup
    environment:
      # The Oracle Database SYS, SYSTEM and PDB_ADMIN password (default: auto generated).
      - ORACLE_PWD=1234
      # The character set to use when creating the database (default: AL32UTF8).
      #- ORACLE_CHARACTERSET=AL32UTF8
```
- docker-compose 실행
```
$ docker-compose up -d
```
### gitlab 설치
- docker-compose.yml
```
version: '3.3'
services:
  web:
    image: 'gitlab/gitlab-ee:latest'
    restart: always
    hostname: '192.168.0.100'
    environment:
      GITLAB_OMNIBUS_CONFIG: |
        external_url 'https://192.168.0.100:9000'
        gitlab_rails['gitlab_shell_ssh_port'] = 9022
      GITLAB_TIMEZONE: Asia/Seoul
    ports:
      - '9000:80'
      - '9443:443'
      - '9022:22'
    volumes:
      - "./config:/etc/gitlab"
      - "./logs:/var/log/gitlab"
      - "./data:/var/opt/gitlab"
    shm_size: '256m'
```
- docker-compose 실행
```
$ docker-compose up -d
```
## 기술 세부 스택
### Spring Boot
- Spring Web`spring-boot-starter-web`
- Spring Boot DevTools`spring-boot-devtools`
- Lombok`lombok`
- Spring Data JPA`spring-boot-starter-data-jpa`
    - H2 Database`com.h2database:h2`
    - MySQL Driver`mysql:mysql-connector-java`
    - Oracle Driver`com.oracle.database.jdbc:ojdbc8`
- Spring REST Docs`spring-restdocs-mockmvc`
- Rest Repositories`spring-boot-starter-data-rest`
- Rest Repositories HAL Explorer`spring-data-rest-hal-explorer`
- Spring Security`spring-boot-starter-security`
- Spring Configuration Processor`spring-boot-configuration-processor`
- Thymeleaf`spring-boot-starter-thymeleaf`

#### spring-boot-starter-web: Spring MVC를 사용한 RESTful 서비스 개발에 사용, Spring Boot의 주요 라이브러리에 대한 의존성 관리
#### spring-boot-devtools: Spring Boot에서 제공하는 개발 편의 모듈(예. 코드 변경 시 자동으로 어플리케이션 재시작)
#### lombok: getter, setter, toString 등의 method 작성 없이 annotation을 기반으로 코드를 자동 완성해주는 코드 다이어트 라이브러리
#### spring-boot-starter-data-jpa: JPA를 더 간편하게 사용할 수 있도록 Repository라는 인터페이스를 제공해주는 Spring Data 프레임워크의 한 파트
#### spring-restdocs-mockmvc: 테스트 코드를 기반으로 Rest API 문서를 자동으로 작성해주는 자바 문서 자동화 프레임워크
#### spring-boot-starter-data-rest/spring-data-rest-hal-explorer: 도메인 모델과 Repository를 분석해서 RESTful API를 제공
#### spring-boot-starter-security: application의 보안을 담당하는 Spring 하위 프레임워크
#### spring-boot-configuration-processor: @ConfigurationProperties를 사용하기 위한 의존성, 클래스에 @ConfigurationProperties를 지정하게 되면 application.yml 파일의 값을 읽어와서 멤버변수에 자동으로 할당
#### spring-boot-starter-thymeleaf: html 태그를 기반으로 동적인 view를 제공해주는 템플린 엔진인 Thymeleaf 사용을 위한 의존성

### 그외 
- QueryDSL 
- Bootstrap 5.2.0
- Heroku

## Spring Boot DevTools
### LiveReload 추가
- Chrome Extension

## Rest Repositories & HAL Explorer
### 설치
```
build.gradle 파일에 다음 라인 추가

dependencies {
  ...
    implementation 'org.springframework.boot:spring-boot-starter-data-rest'
    implementation 'org.springframework.data:spring-data-rest-hal-explorer'
  ...
}  
```
### HAL Explorer Page
http://localhost:8080/api

## Spring Security
### 설치
```
dependencies {
  ...
	implementation 'org.springframework.boot:spring-boot-starter-security'
	implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity5'
  ...
}
```

## 실행환경 설정
### 로컬 PC에서 실행
Edit Configurations -> Build and run -> VM Option란에 '-Dspring.profiles.active=local' 이라고 적는다.
(https://adg0609.tistory.com/m/61)

# 선택 사항
## Swagger
### 설치
```
build.gradle 파일에 다음 라인 추가

dependencies {
  ...
  implementation 'org.springdoc:springdoc-openapi-ui:1.6.11'
  ...
}  
```
### Swagger Page
http://localhost:8080/swagger-ui/index.html
### 참고 사이트
https://springdoc.org/

## H2 Database
### 실치
```
build.gradle 파일에 다음 라인 추가

dependencies {
  ...
	runtimeOnly 'com.h2database:h2'
  ...
}  
```
### H2 Console Page
http://localhost:8080/h2-console

## Spring Configuration Processor
Generate metadata for developers to offer contextual help and "code completion" when working with custom configuration keys (ex.application.properties/.yml files).
### 설치
```
dependencies {
  ...
    annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor'
  ...
}
```

## Heroku
### Heroku CLI 설치
- https://devcenter.heroku.com/articles/getting-started-with-java#set-up

### 데모 페이지
*  https://leezy-spring-app.herokuapp.com/
