/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

/**
 *
 * @author 2153043
 */
public class ShapeFactory {
     
	public static Shape create(RegularShapeType type){
        Shape shape=null;
        switch(type){
            case Triangle:
                shape = new Triangle();
				break;
			case Quadrilateral:
				shape = new Quadrilateral();
				break;
			case Hexagon:
				shape = new Hexagon();
				break;
			case Pentagon:
				shape = new Pentagon();
				break;
        }
        return shape;
                
    }
    
}
