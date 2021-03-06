/*
 * @(#)ProcDeclaration.java                        2.1 2003/10/07
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
    //  Nuevo metodo creado apartir de ProcDeclaration extendiendo de ProcFuncs
    //  con nueva implementacion variable
    //
    ///////////////////////////////////////////////////////////////////////////////

public class RecursiveProc extends ProcFuncs {

  public RecursiveProc (Identifier iAST, FormalParameterSequence fpsAST,
  		   Command cAST, SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    FPS = fpsAST;
    C = cAST;
  }

  public Object visit (Visitor v, Object o) {
    return v.visitRecursiveProc(this, o);
  }
  
  
  @Override
  public Object visitRecursive(Visitor v, Object o) {
    return v.visitRecursiveProcVar(this, o);
  }

  public Identifier I;
  public FormalParameterSequence FPS;
  public Command C;
}
