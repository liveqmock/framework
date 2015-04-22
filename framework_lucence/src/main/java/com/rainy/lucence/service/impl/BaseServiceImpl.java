package com.rainy.lucence.service.impl;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import com.rainy.lucence.service.IBaseService;

public class BaseServiceImpl implements IBaseService {
	
	public void addIndex () throws IOException {
		Path path = FileSystems.getDefault().getPath("logs", "access.log");
		Directory dir = FSDirectory.open(path);
	}

}
