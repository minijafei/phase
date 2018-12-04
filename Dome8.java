package TWO_TEST;

interface Food{
	void food();
	default void food1() {
		System.out.println("��ʳ��");
	}
}

class Feeder{
	public void feed(Animal animal,Food food) {
		animal.show();
		food.food();
	}
}

class Animal{
	public void eat(Food food) {
		food.food();
	}
	public void show(){
		System.out.println("����һֻС����");
	}
}

class Dog extends Animal{
	public void show(){
		System.out.println("����һֻС��");
	}
	public void run() {
		System.out.println("С������");
	}
}

class Cat extends Animal{
	public void show(){
		System.out.println("����һֻСè");
	}
	public void play() {
		System.out.println("Сè����");
	}
}

class Fish extends Animal implements Food{
	public void food() {
		System.out.println("ʳ��--��");
	}
	public void show(){
		System.out.println("����һ��С��");
	}
	public void swim() {
		System.out.println("С����ˮ����");
	}
}

class Bone implements Food{
	public void food() {
		System.out.println("ʳ��--��ͷ");
	}
}


public class Dome8 {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Feeder feed = new Feeder();
		Bone bone = new Bone();
		Animal animal = new Animal();
		feed.feed(dog, bone);
		cat.play();
		animal.show();
		animal.eat(fish);
	}
}
