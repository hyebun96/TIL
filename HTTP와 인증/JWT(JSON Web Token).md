# JWT(JSON Web Token)

JWT는 Json으로 된 Token을 사용하는 방식의 인증입니다. 즉, OAuth와 같이 Token기반의 인증방식 입니다.

JWT는 토큰 자체가 의미를 갖는 Claim기반의 토큰 방식입니다. Claim(권한)은 사용자에 대한 프로피터나 속성을 의미합니다. 즉, JWT는 OAuth처럼 아무 의미 없는 문자열로 된 토큰이 아니다.

### JWT 의 공식문서

---

[https://jwt.io/introduction/](https://jwt.io/introduction/)

[https://tools.ietf.org/html/rfc7519](https://tools.ietf.org/html/rfc7519)

### Token을 생성하고 요청하는 프로세스

---

- JSON 객체에 요구사항을 작성
- 어떠한 암호화 방식을 이용해서 문자열로 인코딩
- HTTP header에 추가함으로써 사용자 인증을 요청
- 서버에서는 Header에 추가된 Token을 디코딩하여 사용자를 인증

### JWT 특징

---

- 정보가 담긴 데이터(JSON객체)를 암호화 하여, HTTP헤더에 추가 시킴 ⇒ 보안성 증가
- 권한을 부여하기 위해 필요한 데이터가 JWT안에 모두 담김

    ⇒ OAuth처럼 인증 서버에서 토큰에 대한 정보를 찾을 필요가 없음

- 보안에 완벽한 것은 아님. 누군가 토큰을 탈취한다면 그 토큰을 이용하여 권한을 수행할 수 있음
- 토큰을 서버에 저장하는 것이 아니므로 토큰에 유효시간을 설정해야함
- 탈취될 가능서을 줄이기 위해 유효시간을 짧게 설정

### JWT의 데이터 무결성_ HMAC

---

JWT는 토큰이 탈취 당하더라도 위변조의 위험을 벗어날 수 있도록 무결성을 보장하는 방법

HMAC(Hash-based Message Authentication)란, 데이터를 암호화하고 해싱하는 기법

해싱은 원문을 일정 길이의 byte로 변환하는데 그 결과 유일하다는 특징이 존재

즉, 원문이 조금이라도 바뀌면 해싱의 결과는 완전히 달라짐

그래서, 토큰을 탈취해서 데이터를 수정하게 되면 해싱의 결과가 완전히 달라지므로 토큰이 위조 되었다는 것을 알수 있음.

### JWT의 특징

---

- JWT는 그 자체가 암호화된 문자열 데이터입니다.
- 토큰은 HTTP header에 추가되기 때문에 서버에 따로 보관할 필요가 없으므로 서버에 부화를 일으키지 않습니다.
- 토큰을 생성할때, 암호화 과정을 거치므로 보안적으로 안전합니다.
- 짧은 시간의 유효시간을 두는 것을 권장합니다.

### JWT 구조 및 생성

---

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/15fc9488-f3d6-417e-911d-feaa36e7fde7/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/15fc9488-f3d6-417e-911d-feaa36e7fde7/Untitled.png)

- 많은 프로그래밍 언어에서 JWT를 지원하는데, 각 언어의 라이브러리에서 자동으로 인코딩 및 해싱작업을 함
- 헤더, 내용, 서명에 적절한 속성과 값들을 명시할 때, 이야기입니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e386b8f-0eff-42b6-b6c5-1d8c713c51fa/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e386b8f-0eff-42b6-b6c5-1d8c713c51fa/Untitled.png)

1. Header(헤더)
- 헤더는 typ와 alg속성을 명시합니다
- typ : 토큰의 타입을 명시합니다.
- alg : 해싱 알고리즘을 명시합니다. 이 알고리즘은 서버에서 토큰을 검증할때, signature에서 사용됩니다.

2. Payload(내용)

- 내용에는 토큰에 대한 정보를 작성합니다.
- 정보는 속성, 값으로 표현되며 이를 Claim이라 합니다.
- Claim은 3가지로 작성 가능

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/766b91a6-4d95-4dd9-bdc6-fff7eefabeed/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/766b91a6-4d95-4dd9-bdc6-fff7eefabeed/Untitled.png)

    (1) registerd claim

    - 미리 정의된 claim으로써, 토큰에 대한 정보를 작성합니다
    - iss : 토큰 발급자
    - exp : 토큰의 만료시간
    - sub : 토큰 제목
    - aud : 토큰 대상자

    (2) public claim

    - 공개적인 claim을 명시하는데, 충돌방지를 위해 URI형식으로 작성합니다

    (3) private claim

    - 서버와 클라이언트가 협의한 claim을 명시합니다.

3. Signature(서명)

- 서명에는 헤더의 인코딩 값과 내용의 인코딩값을 .으로 연결하여 합친 후 비밀키로 해싱
- 일종의 암호화하는 작업

### 결론

---

- header + payload + signature의 각값들을 "."으로 합치면 하나의 JWT가 생성
- 이렇게 생성된 JWT를 HTTP header에 추가하여 서버에 요청을 하면 서버는 이를 디코딩하여 사용자 인증을 하게됩니다
- JWT는 자체적으로 정보를 갖고 있는 토큰이기 때문에 서버에 저장될 필요가 없습니다.
- 즉, 서버로 독립적이라 할 수 있으며, 서버의 부담을 덜어줄 수 있다는장점이 존재

### JWT의 저장 위치

---

- 브라우저의 쿠키
- local storage
- session storage
- **HTTP Only옵션 쿠키 <<Best>>**