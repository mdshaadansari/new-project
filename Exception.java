package exception_handling;

class A{}

 class ObjectCreator{
	public Object getInstance(String className)throws ClassNotFoundException, IllegalAccessException,InstantiationException {
			Object ref = null;
			try {
			Class cl = Class.forName(className);
			ref = cl.newInstance();
			} catch (Exception e) {
			// Send mail to Mail ID
			throw e;
			}
			return ref; 
	}

}

class Ab{
	public static void main(String[] args) {
		ObjectCreator obj=new ObjectCreator();
		Object a;
		try{
			 a=obj.getInstance("ObjectCreator");
			 System.out.println("a");
			 System.out.println(obj.getClass()==a.getClass());
		}catch (Exception e) { 
			 System.out.println(e);
		}
		
	}
}
