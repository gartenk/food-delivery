from external.결제이력 import 결제이력
import requests
import json


def 결제(obj):
	headers = {'Content-Type':'application/json'}
	ip = "http://localhost:"
	port = "### this should be changed ###"
	target = "/결제이력"
	address = ip+port+target
	data = json.dumps(obj.__dict__)
	response = requests.post(address,data=data, headers=headers)
	response = response.content.decode('utf8').replace("'", '"')
	'''
    LOGIC GOES HERE
    '''

	return response


