from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class OrderCanceled(AbstractEvent):
    id : int
    item : str
    qty : int
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.item = None
        self.qty = None

