
from AbstractEvent import AbstractEvent
import json

class 배달시작됨(AbstractEvent):
    id : int
    요리종류 : str
    배달지주소 : str
    orderId : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.요리종류 = None
        self.배달지주소 = None
        self.orderId = None

