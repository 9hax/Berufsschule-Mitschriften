# Zusatzaufgabe: Twist

Documentation will be written in the english language for sake of readability.

``twistor`` is a simple command line application for twisting words and sentences.

This program "twists" and "untwists" words based on a dictionary of words provided by the user.  
It's long been a well-known fact that it's pretty easy for humans to read words like "hlelo" (hello) if the first and last letters of a word are still in the correct position.  
This program uses this fact to twist words of sentences and uses a dictionary supplied by the user to untwist words or sentences.

## Usage

```bash
$ twistor --interactive
```

This launches the interactive mode of the twister program.
You will be presented with a menu of four options. 

1. Twist
2. Untwist
3. Manage loaded word lists

You can also run ``twistor`` as a simple command line application.  
By default, arguments are treated as sentences.

```bash
$ twistor This sentence is difficult to read.
Tihs stneecne is dcuiflfit to raed. 
```

The following command line flags are supported:

- ``--add-list [PATH]`` loads a custom word list. 
- ``--no-default`` skips loading the default word list.



