import request from '../utils/request'

interface LoginPayload {
  username: string
  password: string
}

interface LoginResponse {
  token: string
}

interface UserProfile {
  id: number
  username: string
  nickname: string
}

export function login(payload: LoginPayload) {
  return request.post<any, LoginResponse>('/auth/login', payload)
}

export function getUserProfile() {
  return request.get<any, UserProfile>('/user/profile')
}
