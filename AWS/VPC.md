### 네트워크 - Amazon VPC
Amazon Virtual Private Cloud(Amazon VPC)에서는 사용자가 정의한 가상 네트워크로 AWS 리소스를 시작할 수 있다.  이 가상 네트워크는 AWS의 확장 가능한 인프라를 사용한다는 이점과 함께 고객의 자체 데이터 센터에서 운영하는 기존 네트워크와 매우 유사합니다.

- Site : [https://kr-id-general.workshop.aws/ko/network/create_vpc.html](https://kr-id-general.workshop.aws/ko/network/create_vpc.html)

(1) 탄력적 IP 할당 받음

 → 할당된 IPv4 주소 : 3.37.11.241

(2) 퍼블릭 및 프라이빗 서브넷이 있는 VPC 등록

퍼블릭서브넷(Public Subnet)?

퍼블릭 서브넷은 EC2인스턴스에 Public IP가 할당되어 Internet Gatewat를 통하여 직접 인터넷에 인바운드/아웃바운드 접근이 가능한 서브넷이고, 프라이빗 서브넷(Private Subnet)은 Public IP가 할당되지 않으나, Net Gateway를 통하여 인터넷에 아웃바운드 접근이 가능한 서브넷입니다.

NAT(Network Address Translate) 게이트웨이

프라이빗 서브넷에 존재하는 EC2인스턴스들이 인터넷과 직접적인 연결없이, 즉 public IP를 인스턴스에 할당하거나 인터넷 게이트웨이를 통할 필요없이 소프트웨어 업데이트 등을 위해 인터넷으로 아웃바운드 통신을 가능하게 해주는 관리형 서비스 입니다.
<br/><br/>


### Amazon EC2?
Amazon Elastic Compute Cloud(Amazon EC2)는 Amazon Web Service(AWS) 클라우드에서 확장 가능 컴퓨팅 용량을 제공합니다. Amazon EC2를 사용하면 하드웨어에 선투자할 필요가없어 더 빠르게 애플리케이션을 개발하고 배포할 수 있습니다. Amazon EC2를 통해 원하는 만큼 가상 서버를 구축하고 보안 및 네트워크 구성과 스토리지 관리가 가능합니다. 또한 Amazon EC2는 요구사항이나 갑작스러운 인기 증대등 변동사항에 따라 신속하게 규모를 확장하거나 축소할 수있어 서버 트래픽 예측 필요성이 줄어듭니다.

