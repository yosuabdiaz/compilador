/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author Yosua Blanco Diaz
 */
public abstract class Func extends ProcFunc{
    
    public Func(Identifier iSAT, FormalParameterSequence fpsAST, TypeDenoter tpAST, Expression eAST, SourcePosition thePosition){
        super(thePosition);
        I = iSAT;
        FPS = fpsAST;
        TD = tpAST;
        E = eAST;
    }
    
    public abstract Object visitFunc(Visitor v, Object o);
    
    
    public Identifier I;
    public FormalParameterSequence FPS;
    public TypeDenoter TD;
    public Expression E;
    
}
