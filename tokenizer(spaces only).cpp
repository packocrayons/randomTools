string* tokenize(string wordToSplit) {
	string* words = new string[MAX_COMMANDS]; //initialize an array to return
	string buf; //buffer to write to
	istringstream ss(wordToSplit); //initialize and send text to string stream
	int i = 0;
	while (ss >> buf) {
		words[i] = buf;
		cout << words[i] <<'\n'; //used for debug
		i+= 1;
	}
	return words;
}
