class GenericMethodExample<T>{
	public void genericPrint(T t){
		System.out.println(t);
	}
	public static void main(String[] x){
		GenericMethodExample<Object> obj = new GenericMethodExample<>();
		obj.genericPrint(101);
		obj.genericPrint("Java");
		obj.genericPrint(3.1412456);
	}
}