/*
 * @(#)FuncDeclaration.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


    ///////////////////////////////////////////////////////////////////////////////
    //
    //  Yosua Andres Blanco Diaz
    //  Dylan Stef Torres Walker 
    //  Johel Mora Calderon
    //  Nuevo metodo creado apartir de FuncDeclaration extendiendo de ProcFuncs
    //  con nueva implementacion variable
    //
    ///////////////////////////////////////////////////////////////////////////////


public class RecursiveFunc extends ProcFuncs {

  public RecursiveFunc (Identifier iAST, FormalParameterSequence fpsAST,
  		   TypeDenoter tAST, Expression eAST,
                   SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    FPS = fpsAST;
    T = tAST;
    E = eAST;
  }

  public Object visit (Visitor v, Object o) {
    return v.visitRecursiveFunc(this, o);
  }
  
  @Override
  public Object visitRecursive(Visitor v, Object o) {
    return v.visitRecursiveFuncVar(this, o);
  }

  public Identifier I;
  public FormalParameterSequence FPS;
  public TypeDenoter T;
  public Expression E;
}
