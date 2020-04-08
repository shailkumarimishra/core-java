package com.onlinelibrary.mapper;

import java.util.List;

import com.onlinelibrary.entity.BookEntity;
import com.onlinelibrary.model.BookModel;

public abstract class BookMapper {
	public abstract List<BookModel> mapToBook(List<BookEntity> entity);

	public abstract List<BookEntity> mapToBookEntity(List<BookModel> model);
}
