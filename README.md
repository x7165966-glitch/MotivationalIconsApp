
<!DOCTYPE html>
<html lang="ar">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>MotivationalIconsApp</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f9f9f9;
        color: #333;
        line-height: 1.6;
        margin: 0;
        padding: 0 20px;
    }

    h1, h2 {
        text-align: center;
        color: #2c3e50;
    }

    img {
        display: block;
        margin: 20px auto;
        max-width: 90%;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    }

    section {
        background-color: #fff;
        margin: 20px auto;
        padding: 20px;
        border-radius: 10px;
        max-width: 800px;
        box-shadow: 0 4px 8px rgba(0,0,0,0.05);
    }

    ul {
        margin: 10px 0 10px 20px;
    }

    code {
        background-color: #ecf0f1;
        padding: 2px 6px;
        border-radius: 4px;
        font-family: Consolas, monospace;
    }

    blockquote {
        border-left: 4px solid #3498db;
        padding-left: 10px;
        color: #555;
        margin: 10px 0;
        font-style: italic;
    }

    .social-links {
        text-align: center;
        margin-top: 30px;
    }

    .social-links a {
        display: inline-block;
        margin: 0 10px;
        text-decoration: none;
        color: #fff;
        background-color: #3498db;
        padding: 10px 15px;
        border-radius: 6px;
        transition: background 0.3s;
    }

    .social-links a:hover {
        background-color: #2980b9;
    }
</style>
</head>
<body>

<h1>MotivationalIconsApp</h1>

<img src="Screen Shoot/scren.jpg" alt="Screenshot">

<section>
<h2>تشغيل المشروع</h2>
<ol>
    <li><strong>فتح المشروع في Android Studio:</strong>
        <ul>
            <li>افتح Android Studio.</li>
            <li>اختر <code>Open an existing project</code> وحدد مجلد المشروع <code>MotivationalIconsApp</code>.</li>
            <li>انتظر حتى يقوم Android Studio بمزامنة المشروع وGradle.</li>
        </ul>
    </li>
    <li><strong>اختيار جهاز لتشغيل التطبيق:</strong>
        <ul>
            <li>يمكنك استخدام <code>Emulator</code> أو توصيل جهاز Android حقيقي.</li>
            <li>اختر الجهاز الهدف من شريط الأدوات في Android Studio.</li>
        </ul>
    </li>
    <li><strong>تشغيل التطبيق:</strong>
        <ul>
            <li>اضغط على زر <code>Run (▶)</code>.</li>
            <li>ستظهر الشاشة الرئيسية للتطبيق مع جميع الأيقونات التحفيزية.</li>
        </ul>
    </li>
</ol>
</section>

<section>
<h2>هيكلية الملفات الأساسية</h2>
<ul>
    <li><code>app/</code> → يحتوي على كود المصدر (<code>src/</code>) وموارد التطبيق (<code>res/</code>).</li>
    <li><code>build.gradle</code>, <code>settings.gradle</code>, <code>gradle.properties</code> → ملفات إعداد المشروع.</li>
    <li><code>gradle/wrapper/</code> → ملفات Wrapper لتشغيل Gradle بدون تثبيته.</li>
    <li><code>gradlew</code>, <code>gradlew.bat</code> → سكريبتات لتشغيل Gradle على Windows وMac/Linux.</li>
</ul>
</section>

<section>
<h2>الملفات التي يمكن تجاهلها</h2>
<ul>
    <li><code>build/</code> → ملفات البناء المولدة تلقائياً.</li>
    <li><code>.idea/</code> → إعدادات IDE الخاصة بك.</li>
    <li><code>local.properties</code> → مسار SDK المحلي على جهازك.</li>
    <li>أي ملفات <code>.iml</code> أو <code>.gradle/</code> أو ملفات مؤقتة.</li>
</ul>
<blockquote>يُنصح بتجاهل هذه الملفات عند مشاركة المشروع أو رفعه على GitHub.</blockquote>
</section>

<section class="social-links">
<h2>تواصل مع المطور</h2>
<p><strong>المطور:</strong> عبد الرحمن</p>
<a href="https://www.linkedin.com/in/yourprofile" target="_blank">LinkedIn</a>
<a href="https://github.com/yourgithub" target="_blank">GitHub</a>
<a href="https://twitter.com/yourtwitter" target="_blank">Twitter</a>
<a href="mailto:youremail@example.com">Email</a>
</section>

</body>
</html>
