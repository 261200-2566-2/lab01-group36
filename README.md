[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/1XksPRM2)
ส่วนที่เขียนอธิบายข้อ1ข้อ2 อยู่ตรงนี้นะครับ ข้างล่างนี้เลยครับ

1.1what should be instance variables?
=   boolean power;
    String model;
    String serialNo;
    double price;
    double[] dimension = {0,0,0};
    boolean certified;
    int fanSpeed;
    double PMlevel;
    boolean filterClean;
1.2what should be instance methods?
=   turnOn();
    turnOff(); 
    approveCertified();
    setFanSpeed(int fanSP);
    checkFilter();
    cleanFilter();
    printModel();
    printDimension();
    checkAirQuality();
1.3what should be class variables?
=   static int totalAirpurifierWasMade=1;
1.4what should be class methods?
=   static void gettotalAirpurifierWasMade();
2.1for each method proposed above, how do you plan to implement it?
give an overview of the computation
what's needed as inputs?
what's to be returned?
=2.1.1method turnOn();,turnOff(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะเซ็ตค่าpowerให้เป็นtrue/falseและจะprintออกมาว่าเครื่องเปิดหรือปิด
=2.1.2method approveCertified();  จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะsetค่าcertifiedเป็นtrueและจะprintออกมาว่าได้รับการapprovedแล้ว
=2.1.3method setFanSpeed(int fanSP); จะรับinputค่าintเข้ามาแต่จะไม่มีoutputออกไปโดยเมื่อค่าintอยู่ระหว่าง1-3ก็จะเซ็ตค่าfanSpeedให้มีค่าตามค่าintและprintออกมาว่าตอนนี้ค่าfanSpeedอยู่ที่levelไหนแต่ถ้าค่าintไม่อยู่ระหว่าง1-3ก็จะprintออกมาว่าlevel 1-3 เท่านั้น
=2.1.4method checkFilter(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะเช็คว่าfilterสะอาดไหมโดยจะดูค่าfilterCleanว่าเป็นtrueไหมถ้าเป็นtrueจะprintออกมาว่าfilterนี้สะอาดแต่ถ้าค่าไม่ใช่trueจะprintออกมาว่าfilterนี้ไม่สะอาด
=2.1.5method cleanFilter(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะเซ็ตให้ค่าfilterCleanเป็นtrue
=2.1.6method printModel(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าmodel,serialNoและprice
=2.1.7method printDimension(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าความกว้าง,ความยาว,ความสูง
=2.1.8method checkAirQuality(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าออกมาให้ดูว่าตอนนี้คุณภาพอากาศเป็นอย่างไรโดยเทียบจากค่าPMlevelว่าอยู่ในช่วงไหนก็จะprintออกมาตามช่วงนั้น
=2.1.9method gettotalAirpurifierWasMade(); จะไม่รับinputเข้าและไม่มีoutputออกจากmethodนี้โดยเมื่อรันmethodนี้จะprintค่าออกมาให้ดูว่าโรงงานผลิตเครื่องAirpurifierไปกี่ตัวแล้ว
