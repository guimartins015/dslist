package com.guidev.dslist.projections;

public interface GameMinProjection {
	
	//PARA EXECUTAR NATIVE SQL NO REPOSITORY
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();

}
