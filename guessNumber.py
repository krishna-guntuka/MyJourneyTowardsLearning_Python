print "Game coming soon"


jackpotNumber = 3

def guessNum():
	inputNum = input("please input number")
	if jackpotNumber == inputNum:
		result = "You won jackpot"
	else:
		result = "You lost buddy"
		
	return result

print guessNum()


