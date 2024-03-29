package net.socket;
/*
 소켓(Socket) Programming
 - 소켓 : 프로세스간에 통신에 사용되는 끝단(End Point)
 		  ex) 전화기 
 - 소켓프로그래밍 : 소켓을 이용한 통신 프로그래밍
 					프로세스간 통신을 위해 마련된 프로그램.
 					자바에서는 java.net 패키지를 통해 소켓프로그래밍을 지원함.
 */
/*
 TCP/IP 프로토콜 : 이기종 시스템간의 통신을 위한 표준 프로토콜.
 				   프로토콜의 집합.
 				 - 내부적으로 TCP, UDP 모두 이 프로토콜에 포함되어 있음.
 				 - OSI 7 계층 중 전송계층에 해당됨.
 */
/*
 TCP 전송방식
 - 연결방식 : 연결 후 통신(전화기) 1:1
 - 특징 : 신뢰성 있는 데이터 전송. 데이터의 수신여부를 확인함
 		  데이터가 손시로디면 재전송. UDP보다 전송 속도가 느림.
 - 해당 클래스 : Socket, ServerSockets
 */
/*
 UDP 전송방식
 - 연결방식 : 비연결 방식(방송, 택배) 1:1, 1:n, n:n
 - 특징 : 신뢰성 없는 데이터 전송
 		  데이터 수신여부확인 안함.
 		  데이터 손실에서 계속 진행.
 		  TCP 보다 전송속도가 빠름.
 - 해당 클래스 : DatagramSocket, DatagramPacket, MulticastSocket
 */
public class SocketSyntax {
}
