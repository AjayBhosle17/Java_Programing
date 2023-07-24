class Parent{


	int x=10;



}

class Parent2{

	int x=20;
}

class Child extend Parent,Parent2{

	System.out.println(super.x);

}

class client{

	Child obj=new Child();
}
