# MotivationalIconsApp

![Screenshot](Screen_Shoot/scren.jpg)


---

## تشغيل المشروع

1. **فتح المشروع في Android Studio**
   - افتح Android Studio.
   - اختر **Open an existing project** وحدد مجلد المشروع `MotivationalIconsApp`.
   - انتظر حتى يقوم Android Studio بمزامنة المشروع وGradle.

2. **اختيار جهاز لتشغيل التطبيق**
   - استخدم **Emulator** أو وصل جهاز Android حقيقي.
   - اختر الجهاز الهدف من شريط الأدوات في Android Studio.

3. **تشغيل التطبيق**
   - اضغط على زر **Run (▶)**.
   - ستظهر الشاشة الرئيسية للتطبيق.

---

## الملفات والمجلدات الأساسية لتشغيل المشروع

- `app/` → يحتوي على الكود المصدر (`src/`) وموارد التطبيق (`res/`).
- `build.gradle`, `settings.gradle`, `gradle.properties` → ملفات إعداد المشروع.
- `gradle/wrapper/` → ملفات Wrapper لتشغيل Gradle بدون تثبيته.
- `gradlew`, `gradlew.bat` → سكريبتات لتشغيل Gradle على Windows وMac/Linux.

---

## الملفات التي يجب تجاهلها / لا حاجة لمشاركتها

- `build/` → ملفات البناء المولدة.
- `.idea/` → إعدادات IDE الخاصة بك.
- `local.properties` → مسار SDK المحلي على جهازك.
- أي ملفات `.iml` أو `.gradle/` أو ملفات مؤقتة.

> هذه الملفات يمكن تجاهلها عند مشاركة المشروع أو رفعه على GitHub.

---

## نصيحة لمشاركة المشروع

- استخدم `.gitignore` قبل رفع المشروع على GitHub أو مشاركته:

```gitignore
# Android Studio
.idea/
*.iml
.gradle/
build/
local.properties

# OS files
.DS_Store
Thumbs.db
