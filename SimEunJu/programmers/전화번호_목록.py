def solution(phone_book):
    phone_book.sort()
    
    for x,y in zip(phone_book, phone_book[1:]):
        if y.startswith(x):
            return False
    
    return True
