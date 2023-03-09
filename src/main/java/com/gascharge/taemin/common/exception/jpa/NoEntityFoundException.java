package com.gascharge.taemin.common.exception.jpa;

public class NoEntityFoundException  extends RuntimeException {

    public NoEntityFoundException() {super("리소스를 찾을 수 없습니다");}
    public NoEntityFoundException(String message) {super(message);}
    public NoEntityFoundException(Class clazz) {super(clazz.getSimpleName() + " 이름의 리소스를 찾을 수 없습니다");}
    public NoEntityFoundException(Class clazz, String id) {super(clazz.getSimpleName() + " 의 " + id + "에 해당하는 리소스를 찾을 수 없습니다");}
}