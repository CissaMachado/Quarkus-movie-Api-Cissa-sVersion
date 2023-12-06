package br.com.mp.quarkusmovie.resources.exception;

public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }
}