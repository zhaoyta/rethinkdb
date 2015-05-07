// Autogenerated by nvert_protofile.py on 2015-05-06.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Delete extends RqlQuery {


    public Delete(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Delete(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Delete(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.DELETE, args, optargs);
    }
    protected Delete(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }

    public static Delete fromArgs(Object... args){
        return new Delete(new Arguments(args), null);
    }

}