

def swap_case(s):
    word = ""
    wordList=list(s)
    
    
    for i in range(len(wordList)):
        if wordList[i].isupper():
            wordList[i] = wordList[i].lower()
            
        else:
            wordList[i] =wordList[i].upper()

            
    
    return "".join(wordList)

x = str(input()).strip()
print(swap_case(x))