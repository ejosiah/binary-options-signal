package com.josiahebhomenye.binary.options.dto;

/**
 * Created by Josiah on 3/7/2016.
 */
public interface DataTransferObject {

	void readObject(byte[] source);

	byte[] writeObject();


}
