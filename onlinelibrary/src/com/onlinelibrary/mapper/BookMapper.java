package com.onlinelibrary.mapper;

import java.util.List;

import com.book.entity.BookDetailsEntity;
import com.book.model.BookDetailsModel;

public abstract class BookMapper {
	public abstract List<BookDetailsModel> mapToBook(List<BookDetailsEntity> entity);

	public abstract List<BookDetailsEntity> mapToBookEntity(List<BookDetailsModel> model);
}
