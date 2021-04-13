# Maven

- 메이븐은 프로젝트 구조와 내용을 기술하는 선언적 접근방식의 오픈소스 빌드 툴
- 컴파일과 동시에 빌드를 수행할 수 있으며 테스트를 병행하거나 서버측 디플로이 자원을 관리
- 프로젝트의 종속 라이브러리들과 그 라이브러리에 영향을 미치는 Dependency 자원을 관리
- 프로젝트의 전반의 리소스 관리와 Congiguration 파일, Doc 생성 및 이와 관련한 표준 디렉터리 구조를 처음부터 일관된 형태로 구성하여 진행하기 때문에 프로젝트 관리 및 배포 역할을 하는 다른 툴들과 연계에서도 뛰어난 유연성을 보임

### Maven 프로젝트 구조

---

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03a25fba-a10a-42a4-8b3b-cad5d3fae0a8/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03a25fba-a10a-42a4-8b3b-cad5d3fae0a8/Untitled.png)

- Group ID : [com.company](http://com.company)
- application-core : 최상위 경로
- pom.xml : 프로젝트 정보가 표시되며, 이름, url, 이슈트래킹 시스템에 대한 명시, CI 서버등 시스템이 대한 명세 가능

**경로의 역할**
**pom.xml** : 프로젝트와 관련된 정보들을 기술
**src/main/java** : 자바 소스 파일 위치. 하위에 org.gliderwiki와 같은 패키지 배치
**src/main/resources** : 프로퍼티나 XML등 리소스 파일을 위치
**src/main/webapp** : Web Project일 경우 WEB-INF등 웹 어플리 케이션 리소스 위치
**src/test/java** : JUnit등의 테스트 파일이 위치
**src/test/resources** : 테스트시에 필요한 resource파일을 위치

### pom.xml

---

```xml
<properties>
		<spring-framework.version>4.3.25.RELEASE</spring-framework.version>
		<org-aspectj.version>1.9.4</org-aspectj.version>
</properties>

<dependencies>
		<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-context</artifactId>
				<version>${spring-framework.version}</version>
		</dependency>
		<dependency>
				<groupId>org.aspectj</groupId>
				<artifactId>aspectjrt</artifactId>
				<version>${org-aspectj.version}</version>
		</dependency>
		<dependency>
				<groupId>org.aspectj</groupId>
				<artifactId>aspectjweaver</artifactId>
				<version>${org-aspectj.version}</version>
		</dependency>
 </dependencies>
```

- 프로젝트 연관정보
    - groupId : 프로젝트 그룹, ID, 도메인이나 특별한 정보로 식별
    - artifactId : 프로젝트 Artifact ID 설정, 프로젝트에 의해 생성되는 Artifact 명. version . packaging 의 형태로 Artifact 파일이 생성
    - version : 버전 설정.
    - packaging : 패키징 타입 설정. 여기서 jar 파일로 생성됨을 의미. jar뿐만 아니라 웹 어플리케이션을 위한 war나 JEE를 위한 ear등의 패키징 타입 지정

- dependencies : 어플리케이션을 컴파일, 테스트, 실행하는데 필요한 라이브러리 목록을 기술
    - dependency : 의존하는 프로젝트 POM 정보를 기술
    - groupId : 의존하는 프로젝트의 그룹 ID
    - artifactId : 의존하는 프로젝트의 artifact ID
    - version : 의존하는 프로젝트의 버전
    - scope : 의존하는 범위(compile, runtime, provided, test로 scope가 나뉨)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/eae99f9e-dac6-4ec8-86c3-32196cb96e08/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/eae99f9e-dac6-4ec8-86c3-32196cb96e08/Untitled.png)

### 의존범위

---

의존 범위는 쉽게 생각하면 서버 측 구동 자원이 로컬에만 필요할 경우 그것을 구분하기 위한 범위 설정

- compile : 기본 scope. 컴파일 할 때 필요
- runtime : 컴파일시에는 필요하지 않지만 런타임에 필요. 배포시 포함
- provided : 컴파일 할때 필요하지만, 컴테이너 등에서 기본으로 제공되는 모듈임을 의미. 배포시 제외
- test : 테스트 단계에 필요. 배포시 제외

### 리파지토리

---

- 메이븐은 pom 파일에 지정한 모듈들을 중앙 리파지토리에서 다운
- 로컬 영역에 Nexus등을 이용하여 리파지토리를 구축

**http:/mvnrepository.com 에서 Maven의 중앙 리파지토리에 등록된 POM 정보를 검색할 수 있습니다. 이 사이트를 통해 라이브러리의 dependency을 조회하여 적용할 수 있다.**

### 메이븐 라이프사이클

---

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b8b6658-0f52-4026-a84e-0f29feee937e/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b8b6658-0f52-4026-a84e-0f29feee937e/Untitled.png)

- 메이븐은 미리 정의하고 있는 빌드 순서를 통해 (라이프 사이클) 빌드결과 삭제, 컴파일 및 자원 복사, 테스트, 압축(패키지) 배포 등의 단계를 밟게 됩니다.
- Meven에서는 clean, build, site의 세가지 Lifecycle을 기본적으로 제공하고 있습니다.
- 컴파일(compile), 테스트(test), 패키지(package), 배포(depooy)등의 과정은 빌드 Lifecycle 포함
- 각 단계에 따른 Goals이 존재

    ⇒ Maven 기본으로 제공하는 phase를 실행하면 해당 Phase와 연결된 플러그인의 Goal이 실행