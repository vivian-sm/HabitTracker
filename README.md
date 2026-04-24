# Habit Tracker App

## 📱 Deskripsi Aplikasi
Habit Tracker adalah aplikasi Android yang digunakan untuk membantu user mencatat dan memantau kebiasaan baik (good habits) yang dilakukan sehari-hari, seperti minum air putih secara rutin, berjalan kaki minimal 10.000 langkah setiap hari, tidur cukup 8 jam, dan kebiasaan positif lainnya.

Aplikasi ini dibuat sebagai **Project 1 mata kuliah Advanced Native Mobile Programming (ANMP) Semester Genap 2025/2026**, Program Studi Teknik Informatika, Universitas Surabaya.

---

## 🎯 Fitur Aplikasi

### 1. Login
- Halaman login sebagai halaman awal aplikasi
- Username dan password bersifat hardcode:
  - Username: student
  - Password: 123
- Menampilkan pesan error apabila user salah memasukkan username atau password

### 2. Dashboard
- Halaman utama setelah login berhasil
- Menampilkan daftar habit menggunakan RecyclerView dalam bentuk card
- Awalnya halaman ini kosong, user harus menekan FAB (+) di ujung kanan bawah untuk Create New Habit
- Setiap card menampilkan:
  - Icon habit
  - Nama habit
  - Deskripsi singkat
  - Status habit (In Progress / Completed)
  - Progress bar
  - Tombol (+) dan (-) untuk menambah atau mengurangi progress
- Status habit otomatis berubah menjadi Completed ketika progress penuh

### 3. Create New Habit
- Halaman untuk menambahkan habit baru
- Data yang diinput:
  - Nama habit
  - Deskripsi singkat
  - Goals (how many to complete this task?)
  - Unit (e.g glasses, minutes, pages, meals)
  - Icon habit (Combo Box Spinner, icon boleh dari Vector Asset)
- Jika button Create Habit ditekan, maka habit baru langsung ditampilkan di dashboard

---

## 🧱 Arsitektur dan Teknologi
- Bahasa Pemrograman: Kotlin
- Arsitektur: MVVM (Model–View–ViewModel)
- Navigation: Android Navigation Component
- Penyimpanan Data: In-memory Data Storage menggunakan Singleton
- Version Control: Git dan GitHub
- IDE: Android Studio

---

## 👥 Anggota Kelompok
- Joshua Nehemia Subagyo – 160423034
- Vivian Sisca Maria – 160423066
- Hon Felix Edward – 160423135

---

## 📦 Repository
Project ini disimpan menggunakan Git dan GitHub sesuai ketentuan Project 1 ANMP.

Link Repository:  
https://github.com/vivian-sm/HabitTracker

---

## 📌 Catatan
- Project dikerjakan sesuai ketentuan dan larangan Project 1 ANMP
- Tidak menggunakan library di luar yang diajarkan
- Repository bersifat public untuk keperluan evaluasi dosen

---

## 📅 Deadline
Pengumpulan link GitHub melalui ULS paling lambat:  
**Jumat, 08 Mei 2026**

Cukup ketua kelompok yang melakukan pengumpulan dan tidak perlu demo project.
