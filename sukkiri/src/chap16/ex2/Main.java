package chap16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Book book = null;

		List<Book> bookList = new ArrayList<>();
		book = new Book("ゲド戦記", "アーサー・K・ル=グウィン");
		bookList.add(book);
		book = new Book("ナルニア国物語", "C・S・ルイス");
		bookList.add(book);
		book = new Book("不思議の国のアリス", "ルイス・キャロル");
		bookList.add(book);
		
		for (Book b : bookList) {
			System.out.println(b.getTitle() + ":" + b.getAuthor());
		}
		

	}

}
