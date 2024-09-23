import cv2
import numpy as np
import requests

# 이미지 URL
url = 'https://arome1004.cafe24.com/images/opencv/lecture_image/01_lenna.png'

# URL에서 이미지 데이터 다운로드
response = requests.get(url)
image_array = np.asarray(bytearray(response.content), dtype=np.uint8)

# 이미지를 디코딩하여 OpenCV 이미지로 변환
image = cv2.imdecode(image_array, cv2.IMREAD_COLOR)

# 이미지를 창에 표시
cv2.imshow('Image', image)



# 아무 키나 누를 때까지 창 유지
cv2.waitKey(0)

# 모든 창 닫기
cv2.destroyAllWindows()
