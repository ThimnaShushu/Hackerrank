

def swap_case(s):
    word = ""
    wordList=list(s)
    
    
    index = 0    
    for i in range(len(wordList)):
        if wordList[index].isupper():
            wordList[index] = wordList[index].lower()
            index= index +1
        else:
            wordList[i] =wordList[i].upper()
            index= index +1

            
    
    return "".join(wordList)

x = str(input())
print(swap_case(x))