import requests
res = requests.get('https://www.piaotian.com/bookinfo/8/8259.html')
res.raise_for_status()
playFile = open('zuiqiangzhuangbixitong.txt', 'wb')

for chunk in res.iter_content(100000):
    playFile.write(chunk)

playFile.close()

