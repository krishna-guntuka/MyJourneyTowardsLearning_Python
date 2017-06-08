jackPotNumber = 3

def guessNum():
	inputNuber = input("Please enter the jackpot number between 1-10")
        
        if jackPotNumber == inputNuber:
	        result = "You have won 100$"
	else:
	        result = "You lost"
          
	return result

print guessNum()
   
