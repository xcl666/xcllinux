from flask import Flask
from flask import render_template

app = Flask(__name__)

from random import randint

@app.route('/')
def lucky():
    lucky_num = randint(1,9)
    return render_template('lucky.html',lucky_num=lucky_num)

if __name__ == '__main__':
    app.run()
