class OfficeBetter 
{
	public static void main(String[] args) 
	{
		try{

			//��̬�����࣬������ʱ�̲ż���
			Class c=Class.forName(args[0]);	
			//ͨ�������� �������ö���
			OfficeAble oa=(OfficeAble)c.newInstance();
			oa.start();
		   }
catch (Exception e){
	e.printStackTrace();
}

	
	}
}
