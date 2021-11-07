/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

/**
 *
 * @author Marco
 */
public class Mammal implements Animal
{
    private String name;
    int num;
    String faveat;
    public void setnameOfAnimal(String name)
    {
        this.name=name;
    }
   
    public void SetNumOfLeges(int n)
    {
        this.num=n;
    }
    public int GetNumOfLeges()
    {
        return (num);
    }
    public void setFavEat(String f)
    {
        this.faveat=f;
    }
    public String faveat()
    {
        return faveat;
    }
    public void printmammal(){
    System.out.print("the name of animal is " + name + ", the the faveat is " + faveat()+ " , the number of legs is " + GetNumOfLeges());
    }
    @Override
    public void Eat(String eat)
    {
    }

    @Override
    public void Travel() 
    {
        System.out.print(" and this travel is walking");
    }
    
    
}
