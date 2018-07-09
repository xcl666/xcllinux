#!/usr/bin/env python3
# This script can get the search in the chrome without open chrome in the terminal.

import webbrowser,sys,pyperclip
if len(sys.argv) > 1:
    address = ' '.join(sys.argv[1:])
else:
    address = pyperclip.paste()
webbrowser.open('https://www.google.com/search?q=' + address)
