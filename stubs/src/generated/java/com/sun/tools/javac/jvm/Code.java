package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.TypeAnnotationPosition;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.util.Bits;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Position;
import java.lang.Cloneable;
import java.lang.String;
import java.util.function.ToIntBiFunction;

public class Code {
  public Code(Symbol.MethodSymbol arg0, boolean arg1, Position.LineMap arg2, boolean arg3,
      StackMapFormat arg4, boolean arg5, CRTable arg6, Symtab arg7, Types arg8, PoolWriter arg9) {
  }

  public boolean checkLimits(JCDiagnostic.DiagnosticPosition arg0, Log arg1) {
    return false;
  }

  public static int typecode(Type arg0) {
    return 0;
  }

  public static int truncate(int arg0) {
    return 0;
  }

  public static int width(int arg0) {
    return 0;
  }

  public static int width(Type arg0) {
    return 0;
  }

  public static int width(List arg0) {
    return 0;
  }

  public static int arraycode(Type arg0) {
    return 0;
  }

  public int curCP() {
    return 0;
  }

  private void emit1(int arg0) {
  }

  private void emit2(int arg0) {
  }

  public void emit4(int arg0) {
  }

  private void emitop(int arg0) {
  }

  void postop() {
  }

  public void emitLdc(PoolConstant.LoadableConstant arg0) {
  }

  public void emitMultianewarray(int arg0, int arg1, Type arg2) {
  }

  public void emitNewarray(int arg0, Type arg1) {
  }

  public void emitAnewarray(int arg0, Type arg1) {
  }

  public void emitInvokeinterface(Symbol arg0, Type arg1) {
  }

  public void emitInvokespecial(Symbol arg0, Type arg1) {
  }

  public void emitInvokestatic(Symbol arg0, Type arg1) {
  }

  public void emitInvokevirtual(Symbol arg0, Type arg1) {
  }

  public void emitInvokedynamic(Symbol.DynamicMethodSymbol arg0, Type arg1) {
  }

  public void emitop0(int arg0) {
  }

  public void emitop1(int arg0, int arg1) {
  }

  public void emitop1(int arg0, int arg1, PoolConstant arg2) {
  }

  public void emitop1w(int arg0, int arg1) {
  }

  public void emitop1w(int arg0, int arg1, int arg2) {
  }

  public void emitop2(int arg0, PoolConstant arg1, ToIntBiFunction arg2) {
  }

  public void emitop2(int arg0, int arg1) {
  }

  public void emitop2(int arg0, int arg1, PoolConstant arg2) {
  }

  public void emitop4(int arg0, int arg1) {
  }

  public void align(int arg0) {
  }

  private void put1(int arg0, int arg1) {
  }

  private void put2(int arg0, int arg1) {
  }

  public void put4(int arg0, int arg1) {
  }

  private int get1(int arg0) {
    return 0;
  }

  private int get2(int arg0) {
    return 0;
  }

  public int get4(int arg0) {
    return 0;
  }

  public boolean isAlive() {
    return false;
  }

  public void markDead() {
  }

  public int entryPoint() {
    return 0;
  }

  public int entryPoint(State arg0) {
    return 0;
  }

  public int entryPoint(State arg0, Type arg1) {
    return 0;
  }

  public int setLetExprStackPos(int arg0) {
    return 0;
  }

  public boolean isStatementStart() {
    return false;
  }

  public void emitStackMap() {
  }

  private int getLocalsSize() {
    return 0;
  }

  void emitCLDCStackMap(int arg0, int arg1) {
  }

  void emitStackMapFrame(int arg0, int arg1) {
  }

  StackMapFrame getInitialFrame() {
    return null;
  }

  public static int negate(int arg0) {
    return 0;
  }

  public int emitJump(int arg0) {
    return 0;
  }

  public Chain branch(int arg0) {
    return null;
  }

  public void resolve(Chain arg0, int arg1) {
  }

  public void resolve(Chain arg0) {
  }

  public void resolvePending() {
  }

  public static Chain mergeChains(Chain arg0, Chain arg1) {
    return null;
  }

  public void addCatch(char arg0, char arg1, char arg2, char arg3) {
  }

  public void compressCatchTable() {
  }

  public void addLineNumber(char arg0, char arg1) {
  }

  public void statBegin(int arg0) {
  }

  public void markStatBegin() {
  }

  private void addLocalVar(Symbol.VarSymbol arg0) {
  }

  void adjustAliveRanges(int arg0, int arg1) {
  }

  public int getLVTSize() {
    return 0;
  }

  public void setDefined(Bits arg0) {
  }

  public void setDefined(int arg0) {
  }

  public void setUndefined(int arg0) {
  }

  private void endScope(int arg0) {
  }

  private void fillLocalVarPosition(LocalVar arg0) {
  }

  private int[] appendArray(int[] arg0, int[] arg1) {
    return null;
  }

  public void fillExceptionParameterPositions() {
  }

  private int findExceptionIndex(TypeAnnotationPosition arg0) {
    return 0;
  }

  void putVar(LocalVar arg0) {
  }

  private int newLocal(int arg0) {
    return 0;
  }

  private int newLocal(Type arg0) {
    return 0;
  }

  public int newLocal(Symbol.VarSymbol arg0) {
    return 0;
  }

  public void newRegSegment() {
  }

  public void endScopes(int arg0) {
  }

  public static String mnem(int arg0) {
    return null;
  }

  private static int lambda$fillLocalVarPosition$4(LocalVar arg0, LocalVar.Range arg1) {
    return 0;
  }

  private static int lambda$fillLocalVarPosition$3(LocalVar.Range arg0) {
    return 0;
  }

  private static int lambda$fillLocalVarPosition$2(LocalVar.Range arg0) {
    return 0;
  }

  private static LocalVar.Range[] lambda$fillLocalVarPosition$1(int arg0) {
    return null;
  }

  private static boolean lambda$fillLocalVarPosition$0(LocalVar.Range arg0) {
    return false;
  }

  public static class Chain {
    public Chain(int arg0, Chain arg1, State arg2) {
    }
  }

  static class Range {
    Range(LocalVar arg0) {
    }

    Range(LocalVar arg0, char arg1) {
    }

    Range(LocalVar arg0, char arg1, char arg2) {
    }

    boolean closed() {
      return false;
    }

    public String toString() {
      return null;
    }
  }

  static class LocalVar {
    LocalVar(Symbol.VarSymbol arg0) {
    }

    public LocalVar dup() {
      return null;
    }

    LocalVar.Range firstRange() {
      return null;
    }

    LocalVar.Range lastRange() {
      return null;
    }

    void removeLastRange() {
    }

    public String toString() {
      return null;
    }

    public void openRange(char arg0) {
    }

    public void closeRange(char arg0) {
    }

    public boolean hasOpenRange() {
      return false;
    }

    public boolean isLastRangeInitialized() {
      return false;
    }

    public LocalVar.Range getWidestRange() {
      return null;
    }
  }

  static class Mneumonics {
    private Mneumonics() {
    }
  }

  public enum StackMapFormat {
    NONE,

    CLDC,

    JSR202
  }

  static class StackMapFrame {
    StackMapFrame() {
    }
  }

  static class State implements Cloneable {
    State(Code arg0) {
    }

    State dup() {
      return null;
    }

    void lock(int arg0) {
    }

    void unlock(int arg0) {
    }

    void push(Type arg0) {
    }

    Type pop1() {
      return null;
    }

    Type peek() {
      return null;
    }

    Type pop2() {
      return null;
    }

    void pop(int arg0) {
    }

    void pop(Type arg0) {
    }

    void forceStackTop(Type arg0) {
    }

    void markInitialized(UninitializedType arg0) {
    }

    State join(State arg0) {
      return null;
    }

    Type error() {
      return null;
    }

    void dump() {
    }

    void dump(int arg0) {
    }
  }
}
