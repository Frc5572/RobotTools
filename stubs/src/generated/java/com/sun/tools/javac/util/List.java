package com.sun.tools.javac.util;

import java.lang.Class;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.String;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.stream.Collector;

public class List extends AbstractCollection implements java.util.List {
  List(Object arg0, List arg1) {
  }

  public static List nil() {
    return null;
  }

  public static List filter(List arg0, Object arg1) {
    return null;
  }

  public List intersect(List arg0) {
    return null;
  }

  public List diff(List arg0) {
    return null;
  }

  public List take(int arg0) {
    return null;
  }

  public static List of(Object arg0) {
    return null;
  }

  public static List of(Object arg0, Object arg1) {
    return null;
  }

  public static List of(Object arg0, Object arg1, Object arg2) {
    return null;
  }

  public static List of(Object arg0, Object arg1, Object arg2, Object[] arg3) {
    return null;
  }

  public static List from(Object[] arg0) {
    return null;
  }

  public static List from(Iterable arg0) {
    return null;
  }

  public static List fill(int arg0, Object arg1) {
    return null;
  }

  public boolean isEmpty() {
    return false;
  }

  public boolean nonEmpty() {
    return false;
  }

  public int length() {
    return 0;
  }

  public int size() {
    return 0;
  }

  public List setTail(List arg0) {
    return null;
  }

  public List prepend(Object arg0) {
    return null;
  }

  public List prependList(List arg0) {
    return null;
  }

  public List reverse() {
    return null;
  }

  public List append(Object arg0) {
    return null;
  }

  public List appendList(List arg0) {
    return null;
  }

  public List appendList(ListBuffer arg0) {
    return null;
  }

  public Object[] toArray(Object[] arg0) {
    return null;
  }

  public Object[] toArray() {
    return null;
  }

  public String toString(String arg0) {
    return null;
  }

  public String toString() {
    return null;
  }

  public int hashCode() {
    return 0;
  }

  public boolean equals(Object arg0) {
    return false;
  }

  public static boolean equals(List arg0, List arg1) {
    return false;
  }

  public boolean contains(Object arg0) {
    return false;
  }

  public Object last() {
    return null;
  }

  public List map(Function arg0) {
    return null;
  }

  public static List convert(Class arg0, List arg1) {
    return null;
  }

  public Iterator iterator() {
    return null;
  }

  public Object get(int arg0) {
    return null;
  }

  public boolean addAll(int arg0, Collection arg1) {
    return false;
  }

  public Object set(int arg0, Object arg1) {
    return null;
  }

  public void add(int arg0, Object arg1) {
  }

  public Object remove(int arg0) {
    return null;
  }

  public int indexOf(Object arg0) {
    return 0;
  }

  public int lastIndexOf(Object arg0) {
    return 0;
  }

  public ListIterator listIterator() {
    return null;
  }

  public ListIterator listIterator(int arg0) {
    return null;
  }

  public java.util.List subList(int arg0, int arg1) {
    return null;
  }

  public static Collector collector() {
    return null;
  }

  private static ListBuffer lambda$collector$0(ListBuffer arg0, ListBuffer arg1) {
    return null;
  }
}
