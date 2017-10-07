class Animal{
	void bark(){
		System.out.println("Woof-Woof");
	}
}

class MyClass{
	public static void main(String[] args){
		Animal dog = new Animal();
		dog.bark();
	}
}
