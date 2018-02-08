/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;
class Animal{
	public void respirate(){
		System.out.println("respiration process.....");
	}
	public void talk(){
		System.out.println("mode of communication....");
	}
}
class Cat extends Animal{
        @Override
	public void talk(){
		System.out.println("MEOW");
	}
}
class Lion extends Animal{
        @Override
	public void talk(){
		System.out.println("ROAR");
	}
}
class Dog extends Animal{
        @Override
	public void talk(){
		System.out.println("BARK");
	}
}
/**
 *
 * @author lenovo
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Animal a;
		a=new Cat();
		a.talk();
		a=new Lion();
		a.talk();
		a=new Dog();
		a.talk();						 
	}
}
        // TODO code application logic here
    
    

