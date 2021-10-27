print("Hi! Welcome to FirstGame V.1.0")
askName = input("What is your name? ")
askAge = int(input("How old are you? "))
print("Okay", askName, ", just a sec ... let me process your data." ) 
if askAge >= 10: 
    print("Great! You are eligible to play FirstGame!")
    askPlayer = input("Ready to play? ").lower()
    if askPlayer == 'yes':
        print("Cool! Let's go!")
        chooseOne = input("Choose one: Left / Right ").lower()
        if chooseOne == "left":
                print("Answer the questions wisely to earn coins")
                coin = 0
                print("Coin status:", coin)
                print("Plot 1: You have very tight income. You live with your 2 child and both are dependent on you. Also it is the beginning of the month.")
                chooseTwo = input("What will you buy: Food / Toy for kids ").lower()
                if chooseTwo == "food":
                        coin = coin + 2
                        print("Coin status:", coin)
                        print("Good! You can buy them toys later when you will save some for extra! :D ")
                        print("")
                elif chooseTwo == "toy for kids":
                        if coin >= 2:
                                coin = coin - 2
                print("Plot 2: Your friend told you to cheat on exam!! In exchange he will buy you a PS4 for which you were waiting for ages! :'( '")
                chooseThree = input("What will you do? Cheat / Wait and save money to buy it ").lower()
                if chooseThree == "wait and save money to buy it ":
                        coin = coin + 2
                        print("Coin status:", coin)
                else:
                        if coin >= 2:
                                coin = coin + 2
                                print("Coin status:", coin)
                        else:
                                print("Coin status:", coin)
                #Further line start here
        else:
                print("Lost.")
    else:
        print("Okay! Good bye!")    
else:
    print("Sorry", askName, ". You are not eligible to play. Try later.")
