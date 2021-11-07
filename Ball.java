/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author Marco
 */
public class Ball implements Tossable
{
    private String BrandName;
    public void ball(String BrandName)
    {
        this.BrandName = BrandName;
    }
    public String getBrandName()
    {
        return BrandName;
    }
    public void bounce() 
    {
        
    }
    @Override
    public void Toss() 
    {
        
    }
}
