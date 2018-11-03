//Library
//Librarian
//Book
//Patron
//Classification
//LibraryInformationSystem

object LibraryInformationSystem {

    def main(args:Array[String]): Unit={
        var book1 = new Book
        book1.title = "History of Libraries in Nigeria"
        var book2 = new Book
        book2.title = "How Computer Networks Work"
        var book3 = new Book
        book3.title = "Learn Java in 21 Days"
        var bestLibrary = Library
        val our3Books = Array(book1, book2, book3)
        bestLibrary.addBook(our3Books)
        val retrieved = bestLibrary.books
        println(retrieved.map(_.title).mkString("\n"));
    }
}

object Library {
    
    def addBook(newBook:Book):Boolean = {
        books(0)=newBook;
        true;
    }
    
    def addBook(newBooks:Array[Book]):Boolean = {
        books=newBooks;
        true;
    }
    var books:Array[Book]=_
}

class Book {
    var title:String = _
}

object Librarian {
    var name:String=_
}

object Patron {
    var name:String=_
}

object Classification {
    var name:String=_
}