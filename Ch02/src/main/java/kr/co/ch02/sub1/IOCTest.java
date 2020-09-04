package kr.co.ch02.sub1;
/*
 	��¥ : 2020/08/31
 	�̸� : ������
 	���� : ������ Ioc �ǽ��ϱ�
 */
public class IOCTest {
	public static void main(String[] args) {
		
		// Ioc ���� (DI ���) �� ���� ���
		TV lgTV = new LgTV();
		lgTV.power();
		lgTV.chUp();
		lgTV.soundUp();
		
		TV samsungTV = new SamsungTV();
		samsungTV.power();
		samsungTV.chUp();
		samsungTV.soundUp();
	}

}
