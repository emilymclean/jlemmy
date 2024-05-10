class Property(object):
    api_name: str
    java_name: str
    cap_java_name: str
    type: str

    def __init__(self, api_name: str, java_name: str, cap_java_name: str, type: str):
        self.api_name = api_name
        self.java_name = java_name
        self.cap_java_name = cap_java_name
        self.type = type


class EnumProperty(object):
    api_name: str
    java_name: str

    def __init__(self, api_name: str, java_name: str):
        self.api_name = api_name
        self.java_name = java_name