package main.java.binarytransfer;/*
	<< ��������� �ұ߿ճ����Ĳ���0�������ߵ�ȥ���ˡ�
	>> ��������� ��߿ճ�����ݣ���������λ��ͬ����ֵ��
	>>> �޷����������� ��߿ճ�����ݣ�������0��
*/

public class Demo03
{
	public static void main(String[] args)
	{
		System.out.println(2<<2);//8
		System.out.println(3<<4);//3*2^4-48
		System.out.println(16>>2);//16/(2^2)=4
		System.out.println(64>>3);//64/(2^3)=8	
	}
}
/*
	���ȣ�����Ҫ֪����λ����������ʹ�ã���Ҫ��ʮ�������ת���ɶ�������ݡ�
	��Ȼ��������ӣ���ô�����ǾͰ�2�Ķ�����д������
	����2Ĭ����int���͵���ݣ����ԣ���32bit��ʾ
		ԭ������ݣ�00000000 00000000 00000000 00000010
		�ƶ���λ��
		         (00)000000 00000000 00000000 0000001000	��Ӧ��ʮ������8

	�������ǵ�ʮ���ƣ�
		�������һ����λ�����3��������ƶ�һλ���ͱ����30�����൱��������10����
		ͬ�?���ǿ��Եó������һ�����ۣ�������Ƶ����������ƶ�1λ�����൱��������
		����ݵĽ��Ʊ���
	��������Ķ�����������ƶ�1λ����������2����
	������ƶ�2λ����������ٱ���?
		Ӧ����2^�ƶ�λ��Ĵ��ݱ���
		
		2<<2	--	2*2^2

	ͬ�?���ǿ��Եõ�һ�������ǣ�
		���ƶ������ǳ���2�Ķ��ٴ��ݡ�
*/