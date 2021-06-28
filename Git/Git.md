# ➰깃(Git)은 무엇인가?

### Git이란?
✔️ 컴퓨터 파일의 변경사항을 추적하고 여러 명의 사용자들 간에 해당 파일들의 작업을 조율하기 위한 분산 버전 관리 시스템<br/>
✔️ 소프트웨어 개발에서 소스 코드 관리에 주로 사용되지만 어떠한 집합의 파일의 변경사항을 지속적으로 추적하기 위해 사용될 수도 있음<br/>
<br/>

### 버전 관리가 필요한 이유
✔️ 전체 개발 소스를 공유하면서 개발 파트를 나누기 수월해짐<br/>
✔️ 같은 모듈을 개발하더라도 소스를 서로 공휴하며 개발 가능<br/>
✔️ 원할 때 예전 버전 내용 전체를 되돌려 볼 수 있으며 복잡한 코드를 개발 할 때 이전 버전과 비교하기 수월<br/>
<br/>

### 깃의 장점
✔️ 빠른 협업환경 조성<br/>
✔️ 누가 언제 무엇을 어떻게 수정했는지 코드 리뷰 가능<br/>
✔️ 이슈 트래커 지원<br/>
✔️깃헙을 이용하여 깃을 쉽개 공유<br/>
✔️ 대부분 IDE에서 git연동을 제공<br/>
<br/><br/>

# ➰Git 프로세스
![https://media.vlpt.us/images/gparkkii/post/3d3a4302-d3cc-480b-aaa0-da826d14fd67/1_X9TKjhjwestOvFD0RsjoNQ.png](https://media.vlpt.us/images/gparkkii/post/3d3a4302-d3cc-480b-aaa0-da826d14fd67/1_X9TKjhjwestOvFD0RsjoNQ.png)
✔️ Working Diretory : 내가 작업하려는 PC내의 디렉터리<br/>
✔️ Staging Area ; git commit하기전에 저장되는 git의 공간(커밋 예정인 파일, 디렉터리들이 모여있는 곳)<br/>
✔️ Local Repository : 내 PC에 파일이 저장되는 개인용 저장소<br/>
✔️ Remote Repository : 원격 저장소(깃허브)<br/>
<br/>

### Git의 주요 개념들
✔️ merge : 한 branch에서 완성한 작업을 다른 branch에 병합하기<br/>
✔️ tag : 특정 이력을 가지는 commit에 대한 참조<br/>
✔️ pull request : 완료한 작업을 다른 사람이 리뷰하고 병합하도록 요청하기<br/>
✔️ issue : 기능에 대한 논의, 버그 추적하기<br/>
✔️ wiki : 링크들을 연결해 웹페이지 만들기<br/>
✔️ push : 내 컴퓨터 로컬에 저장되어 있던 버전 정보를 서버(git 저장소)에 올리기<br/>
✔️ pull : Git 저장소 서버로부터 내 컴퓨터 로컬로 버전 정보 전체를 가져오기<br/>
<br/><br/>

# ➰ Git 생성하기
### Git 다운로드
✔ 깃 계정 정보 설정하기
```java
// 터미널에 git 계정 정보 설정 코드 입력
git config --global user.name ""
git config --global user.email ""
```
<br/>

✔ 깃 저장소 만들기
```java
// 터미널에 git 저장소 생성 코드 입력
git inti
```
<br/>

✔ .gitignore
npm install을 이용해서 다운받는 라이브러리, node_modeules에 쌓이는 파일 수가 많기 때문에 깃저장소에 올리지 않고 gitignore 파일을 생성해서 따로 관리함<br/>
![https://media.vlpt.us/images/gparkkii/post/a95b5a39-6f86-4975-b0d4-a5626f598c96/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202020-12-24%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%205.53.38.png](https://media.vlpt.us/images/gparkkii/post/a95b5a39-6f86-4975-b0d4-a5626f598c96/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202020-12-24%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%205.53.38.png)

---

# ➰ 깃허브(GitHub)란 무엇인가?
### Github란?
✔ 분산 버전 관리 툴인 깃(Git)을 사용하는 프로젝트를 지원하는 웹호스팅 서비스<br/>
✔ 깃(Git)이 텍스트 명령어 입력 방식인데 반해, 깃허브는 화려한 그래픽 유저 인터페이스(GUI)를 제공<br/>
